package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        palavra = palavra.toLowerCase();
        int tamanhoPalavra = palavra.length();
        StringBuilder invertido = new StringBuilder();
        for (int i = tamanhoPalavra - 1; i >= 0; i--) {
            invertido.append(palavra.charAt(i));
        }
        return palavra.contentEquals(invertido);
    }
}
