package entity;

import lombok.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@DynamicUpdate
@DynamicInsert
public class Author implements Serializable{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) // генерация ID через Autoincrement в MySQL
    private Long id;

    @NonNull
    private String name;

    @Column(name = "second_name")
    private String secondName;



}
