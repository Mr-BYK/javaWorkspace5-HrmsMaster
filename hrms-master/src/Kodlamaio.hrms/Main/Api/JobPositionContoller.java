import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import Kodlamaio.hrms.Business.Abstracts.JobPositionService;
import Kodlamaio.hrms.Entities.Abstracts.JobPosition;


@RestController
@RequestMapping ("/api/jobPositions")

public class JobPositionContoller {
private JobPositionService jobPositionService;

@Autowired
public JobPositionContoller (JobPositionService jopPositionService) {
	super();
	this.jobPositionService = jobPositionService;
}

@GetMapping ("/getAll")
public List<JobPosition> getAll(); {
	return this.jobPositionService.getAll();
	}
}
