/**
 */
package org.jboss.drools.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.jboss.drools.BinomialDistributionType;
import org.jboss.drools.DroolsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binomial Distribution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jboss.drools.impl.BinomialDistributionTypeImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.jboss.drools.impl.BinomialDistributionTypeImpl#getTrials <em>Trials</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinomialDistributionTypeImpl extends DistributionParameterImpl implements BinomialDistributionType {
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * This is true if the Probability attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean probabilityESet;

	/**
	 * The default value of the '{@link #getTrials() <em>Trials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrials()
	 * @generated
	 * @ordered
	 */
	protected static final long TRIALS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTrials() <em>Trials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrials()
	 * @generated
	 * @ordered
	 */
	protected long trials = TRIALS_EDEFAULT;

	/**
	 * This is true if the Trials attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trialsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinomialDistributionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroolsPackage.Literals.BINOMIAL_DISTRIBUTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		boolean oldProbabilityESet = probabilityESet;
		probabilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroolsPackage.BINOMIAL_DISTRIBUTION_TYPE__PROBABILITY, oldProbability, probability, !oldProbabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProbability() {
		double oldProbability = probability;
		boolean oldProbabilityESet = probabilityESet;
		probability = PROBABILITY_EDEFAULT;
		probabilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DroolsPackage.BINOMIAL_DISTRIBUTION_TYPE__PROBABILITY, oldProbability, PROBABILITY_EDEFAULT, oldProbabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProbability() {
		return probabilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTrials() {
		return trials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrials(long newTrials) {
		long oldTrials = trials;
		trials = newTrials;
		boolean oldTrialsESet = trialsESet;
		trialsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroolsPackage.BINOMIAL_DISTRIBUTION_TYPE__TRIALS, oldTrials, trials, !oldTrialsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrials() {
		long oldTrials = trials;
		boolean oldTrialsESet = trialsESet;
		trials = TRIALS_EDEFAULT;
		trialsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DroolsPackage.BINOMIAL_DISTRIBUTION_TYPE__TRIALS, oldTrials, TRIALS_EDEFAULT, oldTrialsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrials() {
		return trialsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DroolsPackage.BINOMIAL_DISTRIBUTION_TYPE__PROBABILITY:
				return getProbability();
			case DroolsPackage.BINOMIAL_DISTRIBUTION_TYPE__TRIALS:
				return getTrials();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DroolsPackage.BINOMIAL_DISTRIBUTION_TYPE__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case DroolsPackage.BINOMIAL_DISTRIBUTION_TYPE__TRIALS:
				setTrials((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DroolsPackage.BINOMIAL_DISTRIBUTION_TYPE__PROBABILITY:
				unsetProbability();
				return;
			case DroolsPackage.BINOMIAL_DISTRIBUTION_TYPE__TRIALS:
				unsetTrials();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DroolsPackage.BINOMIAL_DISTRIBUTION_TYPE__PROBABILITY:
				return isSetProbability();
			case DroolsPackage.BINOMIAL_DISTRIBUTION_TYPE__TRIALS:
				return isSetTrials();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (probability: ");
		if (probabilityESet) result.append(probability); else result.append("<unset>");
		result.append(", trials: ");
		if (trialsESet) result.append(trials); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BinomialDistributionTypeImpl
