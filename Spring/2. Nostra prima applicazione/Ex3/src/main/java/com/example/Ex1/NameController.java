package com.example.Ex1;
import com.example.Ex1.DTO.NameDTO;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/v1")


public class NameController {

    @GetMapping(path = "/name")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "Correctly functioning"),
                    @ApiResponse(responseCode = "400", description = "Bad request"),
                    @ApiResponse(responseCode = "404", description = "Not found")
            })

    public String returnName(@RequestParam(value = "name", required = false, defaultValue = "John") String name) {
        return name;
    }


    @PostMapping(path = "/reversedName")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "Correctly functioning"),
                    @ApiResponse(responseCode = "400", description = "Bad request"),
                    @ApiResponse(responseCode = "404", description = "Page not found")
            })

    public StringBuilder reversedName(@RequestBody NameDTO nameDTO) {

        StringBuilder finalWord = new StringBuilder(((nameDTO.getName())));
        return finalWord.reverse();
    }
}
