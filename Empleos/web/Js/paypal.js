/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        paypal.Button.render({

            env: 'sandbox', // sandbox | production

            // PayPal Client IDs - replace with your own
            // Create a PayPal app: https://developer.paypal.com/developer/applications/create
            client: {
                sandbox:    'AYEcykzIm_hgrMFaMjt2CmpdLNJBd7EONojMmd7lk1yaysnF3uGIJ-r0c7puWe0JFCVMw25jMmJ0upuH'
            },

            // Show the buyer a 'Pay Now' button in the checkout flow
            commit: true,

            // payment() is called when the button is clicked
            payment: function(data, actions) {

                // Make a call to the REST api to create the payment
                return actions.payment.create({
                    payment: {
                        transactions: [
                            {
                                amount: { total: '1.00', currency: 'USD' }
                            }
                        ]
                    }
                });
            },

            // onAuthorize() is called when the buyer approves the payment
            onAuthorize: function(data, actions) {
                $.ajax({type: "POST", 
                  url:"ServletPago", 
                  data: JSON.stringify({payerID:data.payerID,paymentID:data.paymentID}), 
                  dataType:"json",
                  success: 
                    function(obj){
                        window.alert("Ok"); 
                    },
                  error: function(status){
                         window.alert("Error");
                    }                    
                });  
//                // Make a call to the REST api to execute the payment
//                return actions.payment.execute().then(function() {
//                    window.alert('Payment Complete!');
//                });
            }

        }, '#paypal-button-container');

    