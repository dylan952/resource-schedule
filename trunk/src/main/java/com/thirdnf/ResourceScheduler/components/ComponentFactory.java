package com.thirdnf.ResourceScheduler.components;


import com.thirdnf.ResourceScheduler.Appointment;
import com.thirdnf.ResourceScheduler.Resource;
import org.jetbrains.annotations.NotNull;


/**
 * This is the Base ComponentFactory which is responsible for creating the components which
 * wrap a resource and appointment.  If you want to use your own custom components then
 * you need to extend this factory and call the
 * {@link com.thirdnf.ResourceScheduler.Scheduler#setComponentFactory(ComponentFactory) setComponentFactory}
 * method.
 *
 * @author Joshua Gerth - jgerth@thirdnf.com
 */
public class ComponentFactory
{
    /**
     * Factory method to create a resource component for a given resource.
     *
     * @param resource (not null) The resource for this resource component.
     *
     * @return (not null) A resource component which derives from the AbstractResourceComponent.
     */
    @NotNull
    public AbstractResourceComponent makeResourceComponent(@NotNull Resource resource)
    {
        return new BasicResourceComponent(resource);
    }


    @NotNull
    public AbstractAppointmentComponent makeAppointmentComponent(@NotNull Appointment appointment)
    {
        return new BasicAppointmentComponent(appointment);
    }
}
