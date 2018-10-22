describe('Kiểm thử - Auto TEST', function () {
    var current = 0;
    beforeEach(function () {
        window.localStorage.setItem('currentUser', `{"_id":"5bc464ddaddc310d644cb0f3","uid":"451878","email":"admin@bautroixa.cf","username":"phạmngọcduy","firstname":"Ngọc Duy","lastname":"Phạm","avatar":"/avatar.jpg","role":"member","__v":0,"language":"vi","score":24}`)
        window.localStorage.setItem('token', `eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoibWVtYmVyIiwidWlkIjoiNDUxODc4IiwiaWF0IjoxNTQwMTIyMzQ4LCJleHAiOjE1NDAyMDg3NDh9.gl9C1l0R7jTmcg4fqFxDs74KnlPn981aH3l7BZS8tCM`)
        window.localStorage.setItem('redirectAfterLogin', `/folder/0`)
    })
    it("Test1", function () {
        cy.visit('https://hoclieu.sachmem.vn/question_set/5ba9a7efc676f8880d70ad3c/5ba9a939c676f8880d70b2ea/view/0');
        cy.get(`button[title="Làm lại"]`).click();
        cy.get('.content').contains("You ought to not be rude to your friends")
            .then(()=> {
                cy.get(`.content p span`).contains('to not be').click({force: true});
                cy.contains('Chốt').click();
                cy.contains('Trả lời chính xác').then(()=>{
                    cy.get('.fa-chevron-right').click();
                })
            })    
    });
    it("Test 2", function () {
        cy.visit('https://hoclieu.sachmem.vn/question_set/5ba9a7efc676f8880d70ad3c/5ba9a939c676f8880d70b2ea/view/1');
        cy.get(`button[title="Làm lại"]`).click();
        cy.contains("Who is my mother")
            .then(()=> {
                cy.get(`.content p span`).contains('Who').click({force: true});
                cy.contains('Chốt').click();
                cy.contains('Trả lời chính xác').then(()=>{
                    cy.get('.fa-chevron-right').click();
                })
            })
        //do tesst
    });
})