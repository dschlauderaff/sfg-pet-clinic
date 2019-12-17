package guru.springframework.sfgpetclinic.services;

import guru.springramework.sfgpetclinic.model.Owner;
import guru.springramework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Owner> findAll();
}
