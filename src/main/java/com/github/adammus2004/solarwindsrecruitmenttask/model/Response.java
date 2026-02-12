package com.github.adammus2004.solarwindsrecruitmenttask.model;

import java.util.List;

public record Response(
        List<ResponseData> responses
) {
    public record ResponseData(
            String name,
            String type,
            String url
    )
    {}
}
