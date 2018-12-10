package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog4j {
    // 基于类的名称获取日志对象
    static Logger logger = Logger.getLogger ( TestLog4j.class );

    public static void main ( String[] args ) throws InterruptedException {
        // 指定配置文件路径按照log4j.properties中的设置进行,与默认配置不同
        PropertyConfigurator.configure ( "C:\\Installation-directory\\IntelliJ IDEA 2018.2.4\\space\\log4j\\log4j\\src\\log4j.properties" );
        // 进行默认配置
//        BasicConfigurator.configure ();
        // 设置日志输出级别
        logger.setLevel ( Level.DEBUG );
        // 输出不同级别的日志
        logger.trace ( "跟踪信息" );
        logger.debug ( "调试信息" );
        logger.info ( "输出信息" );
        Thread.sleep ( 1000 );
        logger.warn ( "警告信息" );
        logger.error ( "错误信息" );
        logger.fatal ( "致命信息" );
    }
}
