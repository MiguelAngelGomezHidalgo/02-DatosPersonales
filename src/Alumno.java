/**
 * 
 * @author MiguelAngelGomezHidalgo
 *
 */
public class Alumno {
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String edad;
	private String telefono;
	private String direccion;
	private String altura;
	private String codigopostal;
	private String sexo;
	private String peso;
/**
 * constructor sin parametros es seguro dejarlo así
 */
	public Alumno() {
	}
/**
 * 
 * @param nombre de la persona
 * @param apPaterno de la persona
 * @param apMaterno de la persona
 * @param edad de la persona 
 * @param telefono de la persona 
 * @param direccion de la persona
 * @param altura de la persona 
 * @param codigopostal de la persona 
 * @param sexo de la persona 
 * @param peso de la persona 
 */
	public Alumno(String nombre, String apPaterno, String apMaterno, String edad, String telefono, String direccion,
			String altura, String codigopostal, String sexo, String peso) {
		super();
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.altura = altura;
		this.codigopostal = codigopostal;
		this.sexo = sexo;
		this.peso = peso;
	}
 /** 
  * 
  * @return regresa el nombre de la persona
  */
	public String getNombre() {
		return nombre;
	}
/**
 * 
 * @param nombre introduce el nombre de la persona en formato String

 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/** 
 * 
 * @return regresa el apellido paterno de la persona
 */
	public String getApPaterno() {
		return apPaterno;
	}
/**
 * 
 * @param apPaterno introduce el apellido paterno de la persona en formato String
 */
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
/**
 * 
 * @return regresa el apellido materno de la persona
 */
	public String getApMaterno() {
		return apMaterno;
	}
/**
 * 
 * @param apMaterno introduce el apellido materno de la persona en formato String
 */
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
/**
 * 
 * @return regresa la edad de la persona
 */
	public String getEdad() {
		return edad;
	}
/**
 * 
 * @param edad introduce la edad de la persona en formato String
 */
	public void setEdad(String edad) {
		this.edad = edad;
	}
/**
 * 
 * @return regresa el telefono de la persona
 */
	public String getTelefono() {
		return telefono;
	}
 /**
  * 
  * @param telefono introduce el telefono de la persona en formato String
  */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
 /**
  * 
  * @return regresa la direccion de la persona
  */
	public String getDireccion() {
		return direccion;
	}
/**
 * 
 * @param direccion introduce la ireccion de la persona en formato String
 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
 /**
  * 
  * @return regresa la altura de la persona
  */
	public String getAltura() {
		return altura;
	}
/**
 * 
 * @param altura introduce la altura de la persona en formato String
 */
	public void setAltura(String altura) {
		this.altura = altura;
	}
/**
 * 
 * @return regresa el C.P de la persona
 */
	public String getCodigopostal() {
		return codigopostal;
	}
/**
 * 
 * @param codigopostal introduce el C.P de la persona en formato String
 */
	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}
/**
 * 
 * @return regresa el genero de la persona
 */
	public String getSexo() {
		return sexo;
	}
/**
 * 
 * @param sexo introduce el genero de la persona en formato String
 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
/**
 * 
 * @return regresa el peso de la persona
 */
	public String getPeso() {
		return peso;
	}
/** 
 * 
 * @param peso introduce el peso de la persona en formao String
 */
	public void setPeso(String peso) {
		this.peso = peso;
	}

	
}
