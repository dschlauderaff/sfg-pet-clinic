package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.services.CrudService;
import guru.springramework.sfgpetclinic.model.Vet;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public Vet findByID(Long id) {
    return super.findById(id);
  }

  @Override
  public Vet save(Vet object) {
    return super.save(object.getId(), object);
  }

  @Override
  public void delete(Vet object) {
    super.delete(object);

  }

  @Override
  public void deleteByID(Long id) {
    super.deleteById(id);
  }
}
