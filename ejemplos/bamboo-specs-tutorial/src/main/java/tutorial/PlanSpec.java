package tutorial;

import com.atlassian.bamboo.specs.api.BambooSpec;
import com.atlassian.bamboo.specs.api.builders.plan.Plan;
import com.atlassian.bamboo.specs.api.builders.project.Project;
import com.atlassian.bamboo.specs.util.BambooServer;

/**
 * Plan configuration for Bamboo.
 * Learn more on: <a href="https://confluence.atlassian.com/display/BAMBOO/Bamboo+Specs">https://confluence.atlassian.com/display/BAMBOO/Bamboo+Specs</a>
 */
@BambooSpec
public class PlanSpec {

    /**
     * Run main to publish plan on Bamboo
     */
    public static void main(final String[] args) throws Exception {
        //By default credentials are read from the '.credentials' file.
        BambooServer bambooServer = new BambooServer("http://localhost:8085");

        Plan plan = new PlanSpec().createPlan();

        bambooServer.publish(plan);
    }

    Project project() {
        return new Project()
                .name("Project Name")
                .key("PRJ");
    }

    Plan createPlan() {
        return new Plan(
                project(),
                "Plan Name", "PLANKEY")
                .description("Plan created from (enter repository url of your plan)");
    }


}
