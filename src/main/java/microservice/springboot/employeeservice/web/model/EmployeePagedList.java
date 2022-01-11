package microservice.springboot.employeeservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class EmployeePagedList extends PageImpl<EmployeePersonalDTO> {

    public EmployeePagedList(List<EmployeePersonalDTO> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public EmployeePagedList(List<EmployeePersonalDTO> content) {
        super(content);
    }
}
