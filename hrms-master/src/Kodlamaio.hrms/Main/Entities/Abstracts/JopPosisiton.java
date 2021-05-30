import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "job_positions")

public class JopPosisiton {

@Id
@GeneratedValue(strategy = Generation.IDENTITY)

@Column(name = "id")
private int id;

@Column(name = "position")
private String position;

public JobPosition() {}

public JobPosition(int id , String position) {
	super();
	this.id=id;
	this.position=position;
	}
}
