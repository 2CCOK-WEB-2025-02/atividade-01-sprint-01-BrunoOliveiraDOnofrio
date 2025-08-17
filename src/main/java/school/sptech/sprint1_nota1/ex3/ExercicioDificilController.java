package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        if (n <= 0) {
            return new ExercicioDificilResponse(0,0);
        }
        int primeiro = 0;
        int segundo = 1;

        int[] veto = new int [n + 1];

        int somador = 0;

        for (int i = 0; i <= n; i++) {
            veto[i] = primeiro;
            int repassa = primeiro;
            primeiro = segundo;
            segundo = repassa + segundo;
        }

        for (int i = 0; i <= n; i++) {
            somador += veto[i];
        }

        return new ExercicioDificilResponse(veto[n], somador);
    }
}
