package petrik.dev.koczkaBased.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import petrik.dev.koczkaBased.props.ErrorResponse;
import petrik.dev.koczkaBased.props.MessageResponse;
import petrik.dev.koczkaBased.util.Quot;


@RestController
public class QuotController {
    Quot quot = new Quot();
    @GetMapping("/quotation")
    public ResponseEntity<Object> getMessage() {
        try {
            String message = quot.getQuot();
            // Elkészítjük a JSON választ
            MessageResponse response = new MessageResponse(message);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            // Ha valamilyen hiba történik, akkor hibát küldünk JSON formátumban
            ErrorResponse errorResponse = new ErrorResponse(e.getMessage());
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}