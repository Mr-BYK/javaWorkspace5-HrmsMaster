
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.hrms.Business.Abstracts.JobPositionService;
import Kodlamaio.hrms.DataAccess.Abstracts.JobPositionDao;
import Kodlamaio.hrms.Entities.Abstracts.JobPosition;



@Service
public class JobPositionManager implements JobPositionService  {
	
	private JobPositionDao jobPositionDao;
	
@Autowired
public JobPositionManager(JobPositionDao jobPositionDao) {
	super();
	this.jobPositionDao = jobPositionDao;
}

@Override
public List<JobPosition> getAll() {
	return this.jobPositionDao.findAll();
	}
}
