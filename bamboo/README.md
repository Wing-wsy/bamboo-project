<h1 style="text-align: center">Bamboo基于Springboot的分布式架构</h1>

## 一、框架项目简介
#### 致力于提供高性能，高可用，高并发的服务器设计方案。构建企业级分布式服务生态系统。

## 二、框架模块简介
### bamboo-business（具体业务架构应用层）
    1.business-admin（后台管理系统业务）
### bamboo-services（分布式架构服务提供层）
    1.services-sms（短信服务）
    2.services-doc（文档服务）
### bamboo-support（服务治理支撑层）
    1.support-config（服务配置中心）
    2.support-regiester（服务注册中心）
### bamboo-technology（技术框架基础支撑层）
    1.bamboo-core（对上层服务架构提供统一化核心标准支持）
    2.bamboo-data-jpa（对上层服务提供简易jpa使用能力）
    3.bamboo-data-mybatis（对上层服务提供简易mybatis使用能力）

## 三、框架能力展示
#### 设计中，敬请期待。

## 四、架构设计指导
### 架构设计风格
    1.分层架构：将软件系统分为多个层次，每个层次负责不同的功能，层与层之间通过接口进行通信。这种架构设计风格能够使得软件系统的结构更加清晰，同时也更加易于维护和扩展。
    2.微服务架构：将软件系统拆分为多个小型的、独立的服务，每个服务负责一个特定的功能，不同的服务之间通过接口进行通信。这种架构设计风格能够提高软件系统的可伸缩性和可维护性，同时也更加容错。
    3.事件驱动架构：通过事件机制进行消息传递和通信，将软件系统分为多个松散耦合的组件，每个组件都可以根据事件进行操作。这种架构设计风格能够提高软件系统的灵活性和可扩展性，同时也可以支持异步消息处理。
    4.领域驱动设计：将软件系统设计为由多个领域模型组成的整体，每个领域模型都负责处理一个特定的业务领域。这种架构设计风格能够提高软件系统的可维护性和可扩展性，同时也更加符合业务需求。
    5.数据驱动架构：将软件系统设计为由多个数据流组成的整体，每个数据流负责处理一个特定的数据源。这种架构设计风格能够提高软件系统的数据处理能力和效率，同时也更加容错和稳定。

### 分布式架构设计
    1.单一职责原则：每个微服务都应该专注于一个特定的业务领域或功能。这样可以使微服务更加模块化，易于维护和扩展。
    2.服务自治：每个微服务都应该独立运行，没有共享的状态或数据。这样可以减少服务之间的依赖性，提高可靠性和可伸缩性。
    3.轻量级通信：微服务之间的通信应该采用轻量级的协议，例如RESTful API或消息队列。这样可以提高通信效率和可靠性。
    4.容错性：每个微服务都应该具有容错机制，例如重试失败的操作或在服务不可用时使用备用服务。
    5.事件驱动架构：微服务可以采用事件驱动的架构，通过事件触发不同的服务进行操作，以实现松耦合和可扩展性。
    6.分布式数据管理：微服务可以采用分布式数据管理方案，例如使用数据库分片或NoSQL数据库。这样可以提高性能和可扩展性。
    7.安全性：每个微服务都应该具有适当的安全措施，例如身份验证和授权，以保护敏感数据和业务逻辑。
    8.监控和日志记录：每个微服务都应该具有监控和日志记录机制，以便快速发现和修复问题。这可以通过使用工具如Prometheus、ELK等实现。

### 五、反馈交流
- 邮箱：jiefangen@gmail.com
