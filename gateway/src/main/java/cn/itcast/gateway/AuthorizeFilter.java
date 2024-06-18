//package cn.itcast.gateway;
//
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
///**
// * @author 龚圆康
// * @class 软件2144
// * @student_number 21040147
// * @Time 2024/3/4
// * 全局过滤器GlobalFilter实现认证拦截
// */
////@Order(-1) //设置优先级-1为最大，数值越大优先级越小
//@Component
//public class AuthorizeFilter implements GlobalFilter, Ordered {
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
////        1.获取请求参数
//        ServerHttpRequest request = exchange.getRequest();
//        MultiValueMap<String, String> params = request.getQueryParams();
//        //2.获取authorization值
//        String auth = params.getFirst("authorization");
//        //3.检验
//        if ("admin".equals(auth)){
//            //放行
//            return chain.filter(exchange);
//        }
//        //4.拦截
//        //4.1设置状态码，采用枚举参数
//        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//        //4.2结束处理
//        return exchange.getResponse().setComplete();
//    }
//
//    @Override
//    public int getOrder() {
//        return -1; //与Order注解效果一样
//    }
//}
