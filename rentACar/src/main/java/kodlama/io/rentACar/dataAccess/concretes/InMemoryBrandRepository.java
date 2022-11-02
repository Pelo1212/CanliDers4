package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;


@Repository
public class InMemoryBrandRepository implements BrandRepository {

	private List<Brand> brands;

    public InMemoryBrandRepository() { // boş constructor bloğum.InMemory'i new'leyen kişi burayı çalıştıracak.
		brands=new ArrayList<Brand>(); // bu haraketi yazdığımızda elimizde boş bir liste var demek.
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"mercedes"));
		brands.add(new Brand(3,"fiat"));
		brands.add(new Brand(4,"volvo"));
		brands.add(new Brand(5,"audi"));
		
	}
	@Override
	public List<Brand> getAll() { // bu satır içinde Brand olan bir lista döndürücem demek.
		
		return brands;//tümünü sorgulamak istediğinde return brands yazıyoruz.
	}
}
