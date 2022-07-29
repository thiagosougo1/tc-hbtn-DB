package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name="MaterialCurso")
public class MaterialCurso {

    @Id
    private long id;

    @Column
    private String url;

}
