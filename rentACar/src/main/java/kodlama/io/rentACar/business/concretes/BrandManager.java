package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService { // BrandManager kimi kullanıcak ?dataAccess'i
   
	private BrandRepository brandRepository;        // ama dataAccess in de sadece interfaci ile iletişime geçer.GevşekBağlılık olayı...
   
	@Autowired
	public BrandManager(BrandRepository brandRepository) { // private dan sonra bu constructor u niye açtık?diyoki bana markayla ilgili 
	                                              //yarın buraya ister InMemory ister Hibernate ister başka bir şey veririm.Bu yüzden parametre önemli
	this.brandRepository = brandRepository;       //BrandMemory şuan sadece InMemory olabilir başka implemnt edilen yok çünkü.
}

	@Override
	public List<Brand> getAll() {
	//iş kuralları
		return brandRepository.getAll() ;
	}

}
