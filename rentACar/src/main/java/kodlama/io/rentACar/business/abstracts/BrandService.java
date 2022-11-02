package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandService {// BrandService nin içinde iş kurallarını yazacağım yapıyı tasarlıyoruz.interfacedeyiz şuan.dikkat!

	List<Brand>getAll(); // markaları listelediğimz yapıyı olştrdk.
	
}
