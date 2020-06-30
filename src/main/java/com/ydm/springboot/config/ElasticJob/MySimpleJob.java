//
////package com.ydm.springboot.config.ElasticJob;
////
/////**
//// * @version : V1.0
//// * @ClassName: com.ydm.springboot.config.ElasticJobMySempleJob
//// * @Description: MySempleJob
//// * @Auther: ydm
//// * @Date: 2019/9/1422:56
//// */
////
////import com.dangdang.ddframe.job.api.ShardingContext;
////import com.dangdang.ddframe.job.api.simple.SimpleJob;
////import com.dangdang.elasticjob.lite.annotation.ElasticSimpleJob;
////import org.springframework.stereotype.Component;
////
////
////@ElasticSimpleJob(cron = "0/10 * * * * ?", jobName = "test123", shardingTotalCount = 2, jobParameter = "测试参数", shardingItemParameters = "0=A,1=B")
////@Component
////public class MySimpleJob implements SimpleJob {
////    @Override
////    public void execute(ShardingContext shardingContext) {
////        System.out.println(String.format("------Thread ID: %s, 任务总片数: %s,当前分片项: %s.当前参数: %s,当前任务名称: %s.当前任务参数: %s" ,
////                Thread.currentThread().getId(),
////                shardingContext.getShardingTotalCount(),
////                shardingContext.getShardingItem(),
////                shardingContext.getShardingParameter(),
////                shardingContext.getJobName(),
////                shardingContext.getJobParameter()
////        ));
////    }
////}
//
//package com.ydm.springboot.config.ElasticJob;
//
///**
// * @version : V1.0
// * @ClassName: com.ydm.springboot.config.ElasticJobMySempleJob
// * @Description: MySempleJob
// * @Auther: ydm
// * @Date: 2019/9/1422:56
// */
//
//
//import org.springframework.stereotype.Component;
//
//
//@ElasticSimpleJob(cron = "0 0 1 1 * ?", jobName = "test123", shardingTotalCount = 2, jobParameter = "测试参数", shardingItemParameters = "0=A,1=B")
//@Component
//public class MySimpleJob implements SimpleJob {
//    @Override
//    public void execute(ShardingContext shardingContext) {
//        System.out.println(String.format("------Thread ID: %s, 任务总片数: %s,当前分片项: %s.当前参数: %s,当前任务名称: %s.当前任务参数: %s" ,
//                Thread.currentThread().getId(),
//                shardingContext.getShardingTotalCount(),
//                shardingContext.getShardingItem(),
//                shardingContext.getShardingParameter(),
//                shardingContext.getJobName(),
//                shardingContext.getJobParameter()
//        ));
//    }
//}
//
