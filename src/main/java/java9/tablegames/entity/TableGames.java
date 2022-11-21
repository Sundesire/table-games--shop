package java9.tablegames.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_games", schema = "table_games_shop")
public class TableGames {
    @Id
    @GeneratedValue
    @Column(name = "id_game")
    private int id;

    @Column(name = "name_game", nullable = false, unique = true)
    private String nameGame;

    @Column(name="small_description")
    private String smallDescription;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;

    @Column(name = "count", nullable = false)
    private int count;

    @Column(name = "img_link")
    private String imgLink;

}
