package com.github.gersongaleno.resttemplateteste.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface ApiService
{
    String getConselho() throws JsonProcessingException;
}