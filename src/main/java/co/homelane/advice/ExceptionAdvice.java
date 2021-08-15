package co.homelane.advice;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;

/**
 * A sample exception handler, that adds an additional exception mapping to the Tide defaults. You'll probably want to
 * remove the TeapotException.
 */
@ControllerAdvice
@Order(HIGHEST_PRECEDENCE)
public class ExceptionAdvice {


}
