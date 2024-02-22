package kr.re.kitri.hello.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspect.lang.;

@Slf4j
public class LoggingAspect {



    public void loggingBeforeService(){
        String methodName = join.getSignature()
        log.info("호출되었습니다.");
    }
}
