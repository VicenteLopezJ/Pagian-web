package pe.edu.vallegrande.proyect.model;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Data
@Table(name = "client")
public class Cliente {

    public static final String ESTADO_ACTIVO = "1";
    public static final String ESTADO_INACTIVO = "0";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birthday_date")
    private java.sql.Date birthdayDate;

    @Column(name = "document_type")
    private String documentType;

    @Column(name = "number_document")
    private String documentNumber;

    @Column(name = "cell_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "client_type")
    private String customerType;

    @Column(name = "address")
    private String address;

    @Column(name = "date")
    private java.sql.Date registerDate;

    @Column(name = "state")
    private String estado = ESTADO_ACTIVO;


    // datos de adutoria lo puedes tomar en cuenta

    // @Column(name = "fe_creacion")
    // private String fe_creacion;

    // @Column(name = "usurio_creacion")
    // private String usurio_creacion;

    // @Column(name = "ip_creacion")
    // private String ip_creacion;

    // @Column(name = "fe_actualizacion")
    // private String fe_actualizacion;

    // @Column(name = "usurio_aactualizacion")
    // private String usurio_aactualizacion;

    // @Column(name = "ip_cactualizacion")
    // private String ip_cactualizacion;

}
