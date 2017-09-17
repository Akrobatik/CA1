package entities;

import entities.Address;
import entities.Phone;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-17T14:02:00")
@StaticMetamodel(Info.class)
public class Info_ { 

    public static volatile SingularAttribute<Info, Address> address;
    public static volatile ListAttribute<Info, Phone> phones;
    public static volatile SingularAttribute<Info, Integer> id;
    public static volatile SingularAttribute<Info, String> email;

}