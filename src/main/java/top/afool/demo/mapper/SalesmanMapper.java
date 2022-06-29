package top.afool.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.afool.demo.entity.Salesman;

@Mapper
public interface SalesmanMapper extends BaseMapper<Salesman> {
}
