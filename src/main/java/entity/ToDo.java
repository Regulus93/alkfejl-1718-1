package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Data //<-- Getters and setters automatic generation
@Entity
@NoArgsConstructor //<-- automatic no arg constr. generation
@AllArgsConstructor //<-- automatic all arg constr. generation
@EqualsAndHashCode //<-- ensure the searching in the db
public class ToDo extends BaseEntity{

    @Column
    private Date dueTo;

    @Column
    private Date created;

    @Column(nullable = false)
    private String text;
}
