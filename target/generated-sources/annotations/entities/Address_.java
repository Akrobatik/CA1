package entities;

import entities.CityInfo;
import entities.Info;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-17T14:02:00")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> street;
    public static volatile SingularAttribute<Address, CityInfo> cityInfo;
    public static volatile SingularAttribute<Address, Integer> id;
    public static volatile SingularAttribute<Address, String> additionalinfo;
    public static volatile ListAttribute<Address, Info> info;

}