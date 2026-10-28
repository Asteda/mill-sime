package fr.ippon.mill.cereals;

import fr.ippon.mill.farmer.domain.Farmer;
import fr.ippon.mill.farmer.infrastructure.secondary.JpaFarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class planificationService {

  @Autowired
  JpaFarmerRepository jpaFarmerRepository;

  public planification create(Farmer farmer, cereals cereal, LocalDate localDate, float quantity) throws Exception {

    if (!jpaFarmerRepository.exists(farmer.getEmail())) {
      throw new Exception("Not found");
    }

    LocalDate datePlusSevenDays = LocalDate.now().plusDays(7);
    if (!localDate.isAfter(datePlusSevenDays)) {
      throw new Exception("Invalid date");
    }

    if(quantity < 1.5 || quantity > 8){
      throw new Exception("Invalid quantity");
    }



  }




}
