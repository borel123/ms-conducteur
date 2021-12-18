package com.msconducteur.demo.entity;
//Libraries

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

/**
 * @author BOREL
 * @version 1.0.0
 * @since 12/18/2021
 */
@Entity

@Data
@AllArgsConstructor
@Builder
//Specify a table's name with this
@Table(name = "tb_driver",

        uniqueConstraints = {

                @UniqueConstraint(
                        name = "idCardNumberUnique",
                        columnNames = "idCardNumber"
                ),

                @UniqueConstraint(
                        name = "emailAddressUnique",
                        columnNames = "emailAddress"
                ),

                @UniqueConstraint(
                        name = "telephoneUnique",
                        columnNames = "telephone"
                )
        }
)
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 10, nullable = false)
    private String matricule;

    @Column(nullable = false)
    private String lastName;

    @Column
    private String firstName;

    @Column(nullable = false)
    private String idCardNumber;

    @Column(nullable = false)
    private String telephone;

    @Column
    private String address;

    @Column
    private String emailAddress;


    public Driver() {
    }
}
