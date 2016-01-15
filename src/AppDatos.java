import javax.swing.JOptionPane;
/**
 * 
 * @author MiguelAngelGomezHidalgo
 *
 */
public class AppDatos {
	
	public static void main(String[] args) {
		Alumno al = new Alumno("Miguel Angel", "Gomez", "Hidalgo", "22 años", "5563456234", "sin dirección", "168 cm",
				"55200", "Masculino", "89 kg");
		
		JOptionPane.showMessageDialog(null, String.format("Hola: %s \n Tu apellido paterno es: %s \n Tu apellido materno es:"
				+ " %s \n Tu edad es: %s \n Tu telefono es: %s \n Tu direccion es: %s \n Tu altura es: "
				+ "%s \n Tu codigo postal: %s \n Tu sexo es: %s \n Tu peso es: %s", al.getNombre(), al.getApPaterno(), al.getApMaterno(),
				al.getEdad(), al.getTelefono(), al.getDireccion(),
				al.getAltura(), al.getCodigopostal(), al.getSexo(), al.getPeso()));

	}
}
