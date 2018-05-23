package dk.comet.services;

import org.springframework.stereotype.Service;

public interface NationalityResponseService {

    String getNationalityResponseBasedOnCountry(String nationality, String country);
}
