package com.holovenko.graphqlintellistart.controller.graphql;

import com.holovenko.graphqlintellistart.dto.CountryDto;
import com.holovenko.graphqlintellistart.dto.HelpDto;
import com.holovenko.graphqlintellistart.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CountryGraphqlController {

    private final CountryService countryService;

    @QueryMapping
    public List<CountryDto> countries() {
        return countryService.getAll();
    }

    @QueryMapping
    public CountryDto country(@Argument Long id) {
        return countryService.getById(id);
    }

    @QueryMapping
    public HelpDto help(@Argument Long id) {
        return countryService.getHelpByCountryId(id);
    }

}
