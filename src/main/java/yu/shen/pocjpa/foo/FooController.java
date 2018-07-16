package yu.shen.pocjpa.foo;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by sheyu on 7/16/2018.
 */
@RestController
@RequestMapping("/foos")
public class FooController {
    @Autowired
    private FooService fooService;


    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/")
    public List<FooDTO> findAll() {
        return fooService.findAll().stream()
                .map(foo -> modelMapper.map(foo, FooDTO.class))
                .collect(Collectors.toList());
    }

    @PostMapping("/")
    public void createFoo(@RequestBody FooCreateDTO fooDto) {
        fooService.createFoo(modelMapper.map(fooDto, Foo.class));
    }

    @GetMapping("/{id}")
    public FooDTO findById(@PathVariable("id") Long id) {
        return modelMapper.map(fooService.findById(id), FooDTO.class);
    }

    @GetMapping("/{id}/historys")
    public List<FooDTO> findHistoryById(@PathVariable("id") Long id,
                                        @RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Optional<LocalDateTime> from) {
        return fooService.findHistoryById(id, from).stream()
                .map(foo -> modelMapper.map(foo, FooDTO.class))
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody FooDTO fooDTO) {
        Foo foo = modelMapper.map(fooDTO, Foo.class);
        foo.setId(id);
        fooService.update(foo);
    }
}
