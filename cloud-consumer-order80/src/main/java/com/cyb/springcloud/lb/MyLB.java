package com.cyb.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
@Component
public class MyLB  implements  LoadBalancer {
 AtomicInteger atomicInteger=new AtomicInteger(0);


public  final  int getAndIncrement(){
    int count;
    int next;
     do {
         count= atomicInteger.get();
         next=count++;
     }while ( !atomicInteger.compareAndSet(count,next) ) ;


    return  next ;
}

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
       int index= getAndIncrement() % serviceInstances.size();


        return serviceInstances.get(index);
    }
}
