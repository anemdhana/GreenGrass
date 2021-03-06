
@Entity
@Table(name = "PAR")
public class Par implements java.io.Serializable, Simple {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
	private int id; //id

    @Column(name = "CD", updatable = false, nullable = false)
	private String cd; //cd 

    @Column(name = "NAME", updatable = false, nullable = false)
	private String name; //Наименование 

    @Column(name = "VAL_TP", updatable = false, nullable = true)
	private String tp; //тип параметра (NM, ST)

    @Column(name = "DATA_TP", updatable = false, nullable = true)
	private String dataTp; //тип данного (SI, LI, ID, BL)
    
    public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
    public String getCd() {
		return this.cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	
	public String getTp() {
		return tp;
	}
	public void setTp(String tp) {
		this.tp = tp;
	}
	
	public String getDataTp() {
		return dataTp;
	}
	public void setDataTp(String dataTp) {
		this.dataTp = dataTp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

