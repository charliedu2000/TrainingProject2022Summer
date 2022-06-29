package top.afool.demo.serviceImpl;

import top.afool.demo.entity.Salesman;
import top.afool.demo.mapper.SalesmanMapper;
import top.afool.demo.service.SalesmanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Charlie Du
 * @since 2022-06-29
 */
@Service
public class SalesmanServiceImpl extends ServiceImpl<SalesmanMapper, Salesman> implements SalesmanService {

}
