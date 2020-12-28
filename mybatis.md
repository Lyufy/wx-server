#项目mybatis使用(User为例)
1，entities目录下创建实体类，如User. 
2, 创建UserMapper,Interface形式，并且打上@Repository标签
    配置对应的xml文件 - UserMapper.xml, 
    注意其中的namespace的写法是Mapper类的路径
3, 创建UserService类，将UserMapper注入到此UserService类中，UserService作为调用数据库的业务层
    @Autowired
4， 创建UserController类，使用@RequestMapping映射访问路径，@PathVariable接收映射路径中rest风格的参数

一次rest风格的访问，例如：
    http://localhost:8080/User/getUser/1
                    |
              UserController
                    |
              UserService
                    |
调用com.weixin.wxbegin.UserMapper目录下的UserMapper类的queryUserById
实际上对于mybatis来讲，需调用命名空间为"com.weixin.wxbegin.UserMapper.UserMapper"下的"queryUserById"语句
                    |
       执行配置的sql语句，取到数据，映射为实体对象User
                    |
               UserController返回视图  
    