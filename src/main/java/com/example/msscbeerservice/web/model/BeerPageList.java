package com.example.msscbeerservice.web.model;

import com.example.msscbeerservice.web.model.BeerDto;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by jt on 2019-05-12.
 */
public class BeerPageList extends PageImpl<BeerDto> {

    public BeerPageList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPageList(List<BeerDto> content) {
        super(content);
    }
}