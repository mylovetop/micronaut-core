package org.particleframework.inject.method.qualifierinjection

import org.particleframework.context.BeanContext
import org.particleframework.context.DefaultBeanContext
import spock.lang.Ignore
import spock.lang.Specification
/**
 * Created by graemerocher on 15/05/2017.
 */
class SetterWithQualifierSpec extends Specification {

    @Ignore
    void "test that a property with a qualifier is injected correctly"() {
        given:
        BeanContext context = new DefaultBeanContext()
        context.start()

        when:
        B b = context.getBean(B)

        then:
        b.a instanceof OneA
        b.a2 instanceof TwoA
    }
}
