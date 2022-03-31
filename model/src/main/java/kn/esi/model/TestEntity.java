package kn.esi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Thariq
 * @created 31-03-2022
 **/

@Data
@Entity
public class TestEntity {

    @Id
    private Integer id;
}
