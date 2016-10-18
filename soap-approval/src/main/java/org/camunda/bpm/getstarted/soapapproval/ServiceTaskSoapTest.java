package org.camunda.bpm.getstarted.soapapproval;



import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
/**
 * @author Daniel Meyer
 *
 */
public class ServiceTaskSoapTest {

  @Rule
  public ProcessEngineRule processEngineRule = new ProcessEngineRule();

  @Test
  @Deployment(resources={"invokeSoapService.bpmn"})
  public void shouldInvokeService() {
    Map<String, Object> variables = new HashMap<String, Object>();
    variables.put("incelsius", "20");
    

    RuntimeService runtimeService = processEngineRule.getRuntimeService();
    TaskService taskService = processEngineRule.getTaskService();

    runtimeService.startProcessInstanceByKey("approve-soap", variables);

    Task task = taskService.createTaskQuery().singleResult();
    Assert.assertNotNull(task);


  }

}
