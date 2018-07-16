package yu.shen.pocjpa.common;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.EntityNotFoundException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sheyu on 7/16/2018.
 */
@RestControllerAdvice
@Component
public class ExceptionHandlerAdvice {
    private Logger logger = LoggerFactory.getLogger("yu.shen.poc");

    @Autowired
    private ModelMapper modelMapper;

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ResponseBody
    public ExceptionDTO entityNotFound(NotFoundException e) {
        logger.error(e.getMessage(), e);
        return modelMapper.map(e, ExceptionDTO.class);
    }
}
