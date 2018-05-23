package dk.comet.services;

import dk.comet.models.Nationality;
import dk.comet.repositories.NationalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("nationalityimpl")
public class NationalityResponseImpl implements NationalityResponseService {


    @Autowired
    private NationalityRepository nationalityRepository;

    @Override
    public String getNationalityResponseBasedOnCountry(String nationality, String country) {

         nationalityRepository.findById(nationality);
         Nationality nationality1 = nationalityRepository.findById(nationality).get();

         if(country.equalsIgnoreCase("USA")) {
             return nationality1.getUSA();
         } else if (country.equalsIgnoreCase(("UK"))) {
             return nationality1.getUK();
         } else if (country.equalsIgnoreCase("Canada")) {
             return nationality1.getCanada();
         } else return nationality1.getAustralia();
    }
}