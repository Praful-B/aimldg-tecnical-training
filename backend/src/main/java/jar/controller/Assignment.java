package jar.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api")
public class Assignment {
   
    @GetMapping("/fact")
    public String getFactorial(@RequestParam("n") int n) {
        return new HashMap<Integer, Integer>() {{
            put(n, calculateFactorial(n));
        }}.toString();
    }

    private int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    @PostMapping("/sum/{n}")
    public HashMap<Integer, Integer> postNaturalNumberSum(@PathVariable int n) {
        return new HashMap<Integer, Integer>() {{
            put(n, n * (n + 1) / 2);
        }};
    }
    
}
