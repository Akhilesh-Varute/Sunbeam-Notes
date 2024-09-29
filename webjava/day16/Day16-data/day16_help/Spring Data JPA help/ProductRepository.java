Consider following Product Entity class 
@Getter
@Setter
//JPA annotations
@Entity
@Table(name = "products")
public class Product extends BaseEntity {
	@Column(length = 30,unique = true)
	private String productName;
	private String description;
	private double price;
	private int availableStock;
	private LocalDate expDate;
	//Product *----->1 Category (uni dir association)
	//product : many , child , owning side
	//Product HAS-A Category
	@ManyToOne
	@JoinColumn(name="category_id",nullable = false)
	private Category productCategory;
	
}

Examples of Spring Data JPA : 


public interface ProductRepository extends JpaRepository<Product, Long> {

    /**
     * Returns the found product entry by using its name as search
     * criteria. If no product entry is found, this method
     * returns null.
     */
    public Product findByProductName(String name);

    /**
     * Returns an Optional which contains the found product
     * entry by using its name as search criteria. If no product entry
     * is found, this method returns an empty Optional.
     */
    Optional<Product> findByProductName(String name);

    /**
     * Returns the found list of product entries whose name or description is given
     * as a method parameters. If no product entries is found, this method
     * returns an empty list.
     */
    List<Product> findByProductNameOrDescription(String name, String description);

    
    /**
     * Return the distinct product entry whose desc is given as a method parameter
     *  If no product entry is found, this method returns null.
     */
    Product findDistinctByDescription(String desc);

    /**
     * Return the products whose price is greater than given price as method parameter
     * @param price
     * @return
     */
    List<Product> findByPriceGreaterThan(double price);

    /**
     * Return the products whose price is less than given price as method parameter
     * @param price
     * @return
     */
    List<Product> findByPriceLessThan(double price);

    /**
     * Return the filtered the product records that match the given text
     * @param name
     * @return
     */
    List<Product> findByProductNameContaining(String name);

    /**
     * Return products based on SQL like condition
     * @param name
     * @return
     */
    List<Product> findByProductNameLike(String name);

    /**
     * Returns a products whose price between start price and end price
     * @param startPrice
     * @param endPrice
     * @return
     */
    List<Product> findByPriceBetween(double startPrice, double endPrice);

    /**
     * Returns a products whose expdate between start date and end date
     * @param startDate
     * @param endDate
     * @return
     */
    List<Product> findByExpiryDateBetween(LocalDateTime startDate, LocalDateTime endDate);

    /**
     * Returns list of products based on multiple values
     * @param names
     * @return
     */
    List<Product> findByProductNameIn(List<String> names);

    List<Product> findFirst2ByOrderByNameAsc();

    List<Product> findTop2ByOrderByPriceDesc();
}
