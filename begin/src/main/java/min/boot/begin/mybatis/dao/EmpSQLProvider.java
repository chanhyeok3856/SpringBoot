package min.boot.begin.mybatis.dao;

import java.util.Map;

public class EmpSQLProvider {
public String paging(Map<String, Object> map) {
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append("select * from (");
	stringBuilder.append("select empno, ename, job, mgr, to_char(hiredate, 'yyyy-mm-dd') as hiredate, sal, comm, deptno, row_number() over (order by empno) as rowNumber ");
	stringBuilder.append("from emp where 1=1 ");
	String searchFilter = (String) map.get("searchFilter");
	String searchQuery = (String) map.get("searchQuery");
	if ("empno".equals(searchFilter) && searchQuery != null && !searchQuery.isEmpty()) {
		stringBuilder.append(" and empno = #{searchQuery}");
	}
	if ("ename".equals(searchFilter) && searchQuery != null && !searchQuery.isEmpty()) {
		stringBuilder.append(" and ename like '%' || #{searchQuery} || '%'");
	}
	if("deptno".equals(searchFilter) && searchQuery != null && !searchQuery.isEmpty( )) {
		stringBuilder.append(" and deptno = #{searchQuery}");
		}
	if("job".equals(searchFilter) && searchQuery != null && !searchQuery.isEmpty( )) {
		stringBuilder.append(" and job like '%' || #{searchQuery} || '%'");
		}
	return searchQuery;
}
}
