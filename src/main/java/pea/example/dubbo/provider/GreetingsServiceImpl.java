package pea.example.dubbo.provider;

import pea.example.dubbo.api.GreetingService;

public class GreetingsServiceImpl implements GreetingService {

  @Override
  public String sayHello(String name) {
    return "hi, " + name;
  }
}